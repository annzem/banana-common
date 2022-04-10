package com.github.annzem.banana.protocol;

public class TgMessage {

    private String chatId;

    private String text;

    public TgMessage() {
    }

    public TgMessage(String text, String chatId) {
        this.chatId = chatId;
        this.text = text;
    }

    public String getChatId() {
        return chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
