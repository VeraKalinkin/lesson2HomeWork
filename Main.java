package server;

public class Main{
    public static void main(String[] args){

        ServerController serverController = new ServerController(new ServerWindow(), new FileStorage());

        new ClientController(new ClientGUI("Max"), serverController);
        new ClientController(new ClientGUI("Jack"), serverController);


        //clientGUI.setLocation(serverWindow.getX() - clientGUI1.getWidth(), serverWindow.getY());
        //clientGUI1.setLocation(serverWindow.getX() + clientGUI1.getWidth(), serverWindow.getY());

    }
    }
