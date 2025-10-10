public class SimpleURL {    // Создали класс SimpleURL

    // Создали поля класса SimpleURL, которые будут отвечать за части URL
    private String protocol;
    private String address;
    private String domainZone;
    private String siteName;
    private String webpageName;
    private String webPageExtension;

    // Ввели геттеры для полей класса
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
  
    // Переопределили метод toString() через аннотацию Override. Переопределение происходит таким образом для наиболее удобного вывода частей URL после парсинга 
    @Override
    public String toString() {
        return String.format(
                "protocol = %s\naddress = %s\ndomainZone = %s\n" +
                "siteName = %s\nwebpageName = %s\nwebPageExtension = %s",
                getProtocol(), getAddress(), getDomainZone(),
                getSiteName() ,getWebpageName(), getWebPageExtension());
    }
}
