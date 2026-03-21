import org.w3c.dom.Node;

class Webpage{
    String url;
    Webpage next;

    Webpage(String url){
        this.url = url;
    }
}

public class BrowserHistory {
    private Webpage currentTop = null;
    private int totalHistory = 0;

    public void visit(String newUrl){
        Webpage page = new Webpage(newUrl);

        page.next = currentTop;
        currentTop = page;
        totalHistory++;
        System.out.println("Visiting: " + newUrl);
    }

    public void back(){
        if (currentTop == null || currentTop.next == null){
            System.out.println("You have no previous tabs.");
            return;
        }
        System.out.println("Going back...");
        currentTop = currentTop.next;
        totalHistory--;
        System.out.println("Back to previous tab: " + currentTop.url);
    }

    public void currentPage(){
        if(currentTop != null){
            System.out.println("Current Tab: " + currentTop.url);
        } else {
            System.out.println("You have no tabs open.");
        }
    }
}
