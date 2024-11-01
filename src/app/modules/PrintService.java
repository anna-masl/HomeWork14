package app.modules;

import app.service.Printer;

public class PrintService implements Printer {

    public static class Message {
        private String text;
        private String sender;

        public Message(String text, String sender) {
            this.text = text;
            this.sender = sender;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getSender() {
            return sender;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }
    }

    @Override
    public void print(Message msg) {

        if ((msg.getSender() == null || msg.getSender().isEmpty())
                && (msg.getText() == null || msg.getText().isEmpty())) {
            Printer anonymous = new Printer() {
                @Override
                public void print(Message msg) {
                    System.out.println("Опрацьовується пусте повідомлення від анонімного користувача...");
                }
            };
            anonymous.print(null);
        } else if (msg.getSender() == null || msg.getSender().isEmpty()) {
            System.out.println("Анонімний користувач відправив повідомлення: <" + msg.getText() + ">");
        } else
            System.out.println("Користувач <" + msg.getSender() + "> відправив повідомлення: <" + msg.getText() + ">");
    }

}