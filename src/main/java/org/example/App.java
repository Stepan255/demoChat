package org.example;

/**
 * App
 */
public class App {

    public static void start(String[] args) {
        ICQ icq = new ICQ(new RepositoryClient());
        Client client1 = new Client("Р’Р°СЃСЏ", icq);
        Client client2 = new Client("РњР°С€Р°", icq);
        Client client4 = new Client("Р’Р°Р»СЊРґРµРјР°СЂ", icq);
        icq.appendClient(client1);
        icq.appendClient(client2);
        icq.appendClient(client4);
        client1.sendMsg("РїСЂРёРІРµС‚ РІСЃРµРј!");
        client2.sendMsg("РєСѓ-РєСѓ!");
        Client client3 = new Client("РљРѕР»СЏ", icq);
        icq.appendClient(client3);

        client3.sendMsg("hello world!");
    }
}



