package day24.socket;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Event;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo4_GUIChat extends Frame{
	private TextField tf;
	private Button send;
	private Button log;
	private Button clear;
	private Button shake;
	private TextArea viewText;
	private TextArea sendText;
	private DatagramSocket socket;
	private BufferedWriter bw;
	/**
	 * GUI����
	 * @throws IOException 
	 * */
	
	/**
	 * �޲ι���
	 * @throws IOException
	 */
	public Demo4_GUIChat() throws IOException{
		init();
		southPanel();
		centerPanel();
		event();
	}
	
	/**
	 * �����¼�����
	 */
	public void event() {
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				try {
					socket.close();
					bw.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.exit(0);
			}
		});
		
		send.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					send();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}	
		});
		
		log.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					logFile();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	
			}
		});
		
		clear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				viewText.setText("");
			}
		});
		
		shake.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					send(new byte[]{-1}, tf.getText());
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}	
		});
		
		sendText.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				//if(e.getKeyCode()==KeyEvent.VK_ENTER&&e.isControlDown()){
				if(e.getKeyCode()==KeyEvent.VK_ENTER){
					try {
						send();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		
	}
	private void shake() {
		int x=this.getLocation().x;  //��ȡ������λ��
		int y=this.getLocation().y;  //��ȡ������λ��
		for(int i=0;i<20;i++){
			try {
				this.setLocation(x+5, y+5);
				Thread.sleep(10);
				this.setLocation(x+5, y-5);
				Thread.sleep(10);
				this.setLocation(x-5, y+5);
				Thread.sleep(10);
				this.setLocation(x-5, y-5);
				Thread.sleep(10);
				this.setLocation(x, y);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	private void logFile() throws IOException {
		bw.flush();  //ˢ�»�����
		FileInputStream fis=new FileInputStream("config.txt");
		ByteArrayOutputStream baos=new ByteArrayOutputStream();//���ڴ��д���������
		int len;
		byte[] arr=new byte[8192];
		while((len=fis.read(arr))!=-1){
			baos.write(arr, 0, len);
		}
		
		String str=baos.toString();  //���ڴ��е�����ת�����ַ���
		viewText.setText(str);
		fis.close();
	}
	
	private void send(byte[] arr,String ip) throws IOException{
		DatagramPacket packet=new DatagramPacket(arr, arr.length, InetAddress.getByName(ip), 9999);
		socket.send(packet);
	}
	private void send() throws IOException {
		String message=sendText.getText();//��ȡ������������
		String ip=tf.getText();           //��ȡIP��ַ
		ip=ip.trim().length()==0?"255.255.255.255":ip;
		send(message.getBytes(), ip);
		
		String time=getCurrentTime(); //��ȡ��ǰʱ��
		
		String str = time+"�Ҷԣ�"+(ip.equals("255.255.255.255")?"������":ip)+"˵��\r\n"+message+"\r\n\r\n";//alt+shift+l��ȡ�ֲ�����
		viewText.append(str);  //����Ϣ��ӵ���ʾ������
		bw.write(str);//����Ϣд�����ݿ���
		sendText.setText("");
		
		
	}
	private String getCurrentTime() {
		Date d=new Date();    //������ǰ���ڶ���
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss:SSS");
		return sdf.format(d);    //��ʱ���ʽ��
	}

	public void centerPanel() {
		Panel center=new Panel();  //�����м��Panel
		viewText = new TextArea();
		sendText = new TextArea(5, 1);
		center.setLayout(new BorderLayout());//����Ϊ�߽粼�ֹ�����
		center.add(sendText,BorderLayout.SOUTH);//�������ı�����ӵ�center���϶�
		viewText.setEditable(false);     //���ò����Ա༭
		viewText.setBackground(Color.WHITE);//���ñ�����ɫΪ��ɫ
		viewText.setFont(new Font("xxx", Font.PLAIN, 15));
		center.add(viewText,BorderLayout.CENTER);//����ʾ�ı�����ӵ�center���м�
		sendText.setFont(new Font("xxx", Font.PLAIN, 20));
		this.add(center,BorderLayout.CENTER);//��center��ӵ�Frame���м�
	}

	public void southPanel() {
		Panel south=new Panel();  //�����ϱߵ�Panel
		tf = new TextField(15);
		tf.setText("127.0.0.1");
		send = new Button("����");
		log = new Button("��¼");
		clear = new Button("����");
		shake = new Button("��");
		south.add(tf);    //����ı���
		south.add(send);  //��ӷ��Ͱ�ť
		south.add(log);   //��Ӽ�¼��ť
 		south.add(clear); //���������ť
		south.add(shake); //����𶯰�ť
		this.add(south,BorderLayout.SOUTH);//��panel����Frame���϶�
	}

	private void init() {
		this.setLocation(500, 50);  //���ô����λ��
		this.setSize(450, 600);     //���ô���Ĵ�С 
		new Receive().start();
		try {
			socket = new DatagramSocket();
			bw=new BufferedWriter(new FileWriter("config.txt",true));
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.setVisible(true);      //���ô�����ʾ
	}
	
	private class Receive extends Thread{//���պͷ�����Ҫͬʱ�����Զ���ɶ��̵߳�
		public void run(){
			try {
				DatagramSocket socket=new DatagramSocket(9999);
				DatagramPacket packet=new DatagramPacket(new byte[8192], 8192);
				while(true){
					socket.receive(packet);//������Ϣ
					byte[] arr=packet.getData();  //��ȡ�ֽ�����
					int len=packet.getLength();  //��ȡ��Ч���ֽ�����
					if(arr[0]==-1&&len==1){//����������������һ���洢��ֵ��-1�����ҳ�����1
						shake();//�����𶯷���
						continue;//��ֹ����ѭ����ִ���´�ѭ������Ϊ�𶯺���Ҫִ������Ĵ���
					}
					String message=new String(arr, 0, len);//ת�����ַ���
					String time=getCurrentTime();
					String ip=packet.getAddress().getHostAddress();//��ȡip��ַ
					String str = time+" "+ip+"����˵��\r\n"+message+"\r\n\r\n";
					viewText.append(str);
					bw.write(str);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}
	public static void main(String[] args){
			try {
				new Demo4_GUIChat();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
	}
}
