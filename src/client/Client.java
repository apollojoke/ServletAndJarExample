package client;
import service.Service;
import service2.Service2;
public class Client{

	public static void main(String[] args){
		Service serivce = new Service();
		serivce.service();
		Service2 service2 = new Service2();
		service2.service();
	}	
}

