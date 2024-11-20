package dev.swagviper.data;

public class UrlData {
    private final String originalUrl;
    private final long expirationTime;

    public UrlData(String originalUrl, long expirationTime) {
        this.originalUrl = originalUrl;
        this.expirationTime = expirationTime;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public long getExpirationTime() {
        return expirationTime;
    }
}
