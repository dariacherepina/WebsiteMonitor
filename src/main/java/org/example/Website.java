package org.example;

public class Website {
    private String websiteName;
    private String url;

    public Website(String websiteName, String url) {
        this.websiteName = websiteName;
        this.url = url;
    }

    @Override
    public String toString() {
        return "Website{" +
                "websiteName=" + websiteName +
                ", url=" + url +
                '}';
    }
}
