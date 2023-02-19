import java.awt.*;
import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;

public class CLI {


    final String os = getOSName();
    final String os_arch = getOSArch();
    final String os_Version = getOSVersion();
    final String shell = getShell();
    final String res = getScreenResolution();
    final String ram = getRAM();
    final String terminal = getTerminalName();
    final String hostname = getHostName();
    final String public_ip = getPublicIP();
    final String java_Version = getJavaVersion();
    final String userName = getUserName();
    final String timeZone = getUserTimeZone();
    final String maxThreads = getMaxThreads();




    final  String ANSII_BOLD_START = "\u001b[1m";
    final String ANSII_BOLD_END = "\u001b[0m";
    final String ANSII_RED_START = "\u001B[31m" ;
    final String ANSII_RED_END = "\u001B[0m" ;

    CLI() throws Exception {
        print();

    }
    public static String getPublicIP() throws Exception {
        URL url = new URL("http://checkip.amazonaws.com/");
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        return in.readLine();
    }



    void print(){

        if (os.contains("Mac")) {
            printOSXArtwork();
        }
        else if (os.contains("Linux") ||os.contains("Arch") || os.contains("Ubuntu") || os.contains("Mint") || os.contains("Kali") || os.contains("Redhead")|| os.contains("debian")) {
            printLinuxArtwork();
        } else if (os.contains("Windows")) {
            printWindowsArtwork();
        }

        System.out.println("_________________________________________");
        System.out.println();
        System.out.println(ANSII_RED_START+ANSII_BOLD_START +"General Information:" +ANSII_BOLD_END+ANSII_RED_END);
        System.out.println(ANSII_BOLD_START +"OS:              " +ANSII_BOLD_END+  os );
        System.out.println(ANSII_BOLD_START +"Version:         " +ANSII_BOLD_END+  os_Version);
        System.out.println(ANSII_BOLD_START +"OS ARCH:         " +ANSII_BOLD_END+ os_arch );
        System.out.println(ANSII_BOLD_START +"Shell:           " +ANSII_BOLD_END+ shell );
        System.out.println(ANSII_BOLD_START +"Resolution:      " +ANSII_BOLD_END+ res );
        System.out.println(ANSII_BOLD_START +"Terminal:        " +ANSII_BOLD_END+ terminal );
        System.out.println(ANSII_BOLD_START +"Java Version:    " +ANSII_BOLD_END+  java_Version);
        System.out.println(ANSII_BOLD_START +"Timezone:        " +ANSII_BOLD_END+  timeZone);
        System.out.println(ANSII_BOLD_START +"Username:        " +ANSII_BOLD_END+  userName);

        System.out.println();
        System.out.println(ANSII_RED_START+ANSII_BOLD_START+"Hardware Information:"+ANSII_BOLD_END+ANSII_RED_END);
        System.out.println(ANSII_BOLD_START+"RAM:             " +ANSII_BOLD_END+ram );
        System.out.println(ANSII_BOLD_START+"Maximum Threads: " +ANSII_BOLD_END+ maxThreads);

        System.out.println();
        System.out.println(ANSII_RED_START+ANSII_BOLD_START+"Network Information:"+ANSII_BOLD_END+ANSII_RED_END);
        System.out.println(ANSII_BOLD_START+"Public IP:       " +ANSII_BOLD_END+public_ip );
        System.out.println(ANSII_BOLD_START+"Hostname:        " +ANSII_BOLD_END+hostname );
        System.out.println();

        System.out.println("_________________________________________");


    }




    public  String getTerminalName() {
        Console console = System.console();
        if (console != null) {
            return console.toString();
        } else {
            return "No terminal available";
        }
    }
    public  String getOSName(){

        return System.getProperty("os.name");
    }
    public  String getOSVersion(){

        return System.getProperty("os.version");
    }
    public  String getOSArch(){

       return System.getProperty("os.arch");
    }
    public  String getHostName() {
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            return localHost.getHostName();
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return "Unknown";
        }
    }
    public  String getShell(){

        return System.getenv("SHELL");
    }
    public  String getRAM(){

        return String.valueOf(Runtime.getRuntime().totalMemory());
    }
    public String getMaxThreads(){

        return String.valueOf(Runtime.getRuntime().availableProcessors());
    }
    public  String getScreenResolution() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        return screenSize.width + "x" + screenSize.height;
    }
    public  String getJavaVersion(){

    return System.getProperty("java.version");
    }
    public  String getUserName(){

        return System.getProperty("user.name");
    }
    public  String getUserTimeZone(){

        return System.getProperty("user.timezone");
    }




    public  void printOSXArtwork(){
        System.out.println( "\u001B[33m" + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⠀⠀⠀⠀⠀⠀\n" +     "\u001B[0m"+
                "\u001B[33m"+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⣿⡿⠀⠀⠀⠀⠀⠀\n" +"\u001B[0m"+
                "\u001B[33m"+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣿⣿⠟⠁⠀⠀⠀⠀⠀⠀\n" +"\u001B[0m"+
                "\u001B[33m"+"⠀⠀⠀⢀⣠⣤⣤⣤⣀⣀⠈⠋⠉⣁⣠⣤⣤⣤⣀⡀⠀⠀\n"  +"\u001B[0m"+
                "\u001B[33m"+"⠀⢠⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⡀\n"  +"\u001B[0m"+
                "\u001B[33m"+"⣠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠋⠀\n" +     "\u001B[0m"+
                "\u001B[33m"+"⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡏⠀⠀⠀\n" +     "\u001B[0m"+
                "\u001B[33m"+"⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀\n" +     "\u001B[0m"+
                "\u001B[33m"+"⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⠀⠀⠀\n" +     "\u001B[0m"+
                "\u001B[33m"+"⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣤⣀\n" +     "\u001B[0m"+
                "\u001B[33m"+"⠀⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠁\n" +     "\u001B[0m"+
                "\u001B[33m"+"⠀⠀⠙⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠁⠀\n" +     "\u001B[0m"+
                "\u001B[33m"+"⠀⠀⠀⠈⠙⢿⣿⣿⣿⠿⠟⠛⠻⠿⣿⣿⣿⡿⠋⠀⠀⠀"  +"\u001B[0m" );
    }
    public  void printLinuxArtwork(){
        System.out.println("         _nnnn_\n" +              "\u001B[0m"+
                "\u001B[33m"+"        dGGGGMMbb\n" +          "\u001B[0m"+
                "\u001B[33m"+"       @p~qp~~qqMb\n" +         "\u001B[0m"+
                "\u001B[33m"+"       M|@||@)  M|\n" +         "\u001B[0m"+
                "\u001B[33m"+"       @,-----.JM|\n" +         "\u001B[0m"+
                "\u001B[33m"+"      JS^\\__/   qKL\n" +       "\u001B[0m"+
                "\u001B[33m"+"     dZP         qKRb\n" +      "\u001B[0m"+
                "\u001B[33m"+"    dZP            qKKb\n" +    "\u001B[0m"+
                "\u001B[33m"+"   fZP              SMMb\n" +     "\u001B[0m"+
                "\u001B[33m"+"   HZM             MMMM\n" +      "\u001B[0m"+
                "\u001B[33m"+"   FqM              MMMM\n" +     "\u001B[0m"+
                "\u001B[33m"+" __| \".        |\\dS\"qML\n" +   "\u001B[0m"+
                "\u001B[33m"+" |    `.       | `' \\Zq\n" +     "\u001B[0m"+
                "\u001B[33m"+"_)      \\.___.,|     .'\n" +     "\u001B[0m"+
                "\u001B[33m"+"\\____   )MMMMMP|   .'\n" +       "\u001B[0m"+
                "\u001B[33m"+"     `-'       `--' "  +"\u001B[0m");
    }
    public  void printWindowsArtwork(){

        System.out.println("⠀⠀⠀⣤⣴⣾⣿⣿⣿⣿⣿⣶⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⡄\n" +         "\u001B[0m"+
                "\u001B[33m"+"⠀⠀⢀⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⢰⣦⣄⣀⣀⣠⣴⣾⣿⠃\n" +       "\u001B[0m"+
                "\u001B[33m"+"⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⡏⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿⣿⠀\n" +       "\u001B[0m"+
                "\u001B[33m"+"⠀⠀⣼⣿⡿⠿⠛⠻⠿⣿⣿⡇⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⡿⠀\n" +       "\u001B[0m"+
                "\u001B[33m"+"⠀⠀⠉⠀⠀⠀⢀⠀⠀⠀⠈⠁⠀⢰⣿⣿⣿⣿⣿⣿⣿⣿⠇⠀\n" +       "\u001B[0m"+
                "\u001B[33m"+"⠀⠀⣠⣴⣶⣿⣿⣿⣷⣶⣤⠀⠀⠀⠈⠉⠛⠛⠛⠉⠉⠀⠀⠀\n" +       "\u001B[0m"+
                "\u001B[33m"+"⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⣶⣦⣄⣀⣀⣀⣤⣤⣶⠀⠀\n" +       "\u001B[0m"+
                "\u001B[33m"+"⠀⣾⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⢀⣿⣿⣿⣿⣿⣿⣿⣿⡟⠀⠀\n" +        "\u001B[0m"+
                "\u001B[33m"+"⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⠁⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀\n" +        "\u001B[0m"+
                "\u001B[33m"+"⢠⣿⡿⠿⠛⠉⠉⠉⠛⠿⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⠁⠀⠀\n" +        "\u001B[0m"+
                "\u001B[33m"+"⠘⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⢿⣿⣿⣿⣿⣿⠿⠛⠀⠀⠀" +"\u001B[0m" );
    }




}




