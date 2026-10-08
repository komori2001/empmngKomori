package empmng.view;

import java.util.Scanner;

public abstract class View {
    
    public void doStart() {
        showHeader();
        
        showContents();
        
        showFooter();
    }
    
    protected void showHeader() {
        String Title = getTitle();
        System.out.println
        ("------------------------------" + Title + "------------------------------");
        
    }
    
    protected abstract String getTitle();
        
    protected abstract void showContents();
        
    protected void showFooter() {
        System.out.println
        ("-------------------------------------------------------------------");
        System.out.println("");
    }
    
    
    protected void showErrorMessage(String Message) {
        System.out.println(Message);

    }
    
    
    
    protected String readinputData(String Message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(Message);
        String word = scanner.next();

        return word;
        
    }
}
