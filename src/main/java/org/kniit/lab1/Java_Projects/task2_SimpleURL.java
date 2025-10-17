package Java_Projects;

public class SimpleURL {
    private String protocol;
    private String address;
    private String domainZone;
    private String siteName;
    private String webpageName;
    private String webPageExtension;

    public SimpleURL(String url) {
        int protocolDelimiterIndex = url.indexOf("://");
        String[] urlPath = url.substring(protocolDelimiterIndex + 3).split("/");

        String urlAddress = urlPath[0];
        String urlDomainZone = urlAddress.substring(urlAddress.indexOf(".") + 1);

        String urlAfterSiteName = urlPath[3];
        String urlWebpageName = urlAfterSiteName.substring(0, urlAfterSiteName.indexOf("?"));
        String urlWebpageExtension = urlWebpageName.substring(urlWebpageName.indexOf(".") + 1);

        this.protocol = url.substring(0, protocolDelimiterIndex);
        this.address = urlAddress;
        this.domainZone = urlDomainZone;
        this.siteName = urlPath[1];
        this.webpageName = urlWebpageName;
        this.webPageExtension = urlWebpageExtension;
    }

    public String getProtocol() {
        return protocol;
    }

    public String getAddress() {
        return address;
    }

    public String getDomainZone() {
        return domainZone;
    }

    public String getSiteName() {
        return siteName;
    }

    public String getWebpageName() {
        return webpageName;
    }

    public String getWebPageExtension() {
        return webPageExtension;
    }

    @Override
    public String toString() {
        return String.format(
                "protocol = %s\naddress = %s\ndomainZone = %s\n" +
                "siteName = %s\nwebpageName = %s\nwebPageExtension = %s",
                getProtocol(), getAddress(), getDomainZone(),
                getSiteName() ,getWebpageName(), getWebPageExtension());
    }
}
