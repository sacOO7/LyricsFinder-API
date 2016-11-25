package LyricFiles;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello World!");


        try {
            for(LyricInfo aresult : ViewLyricsSearcher.search("westlife","my love", 1).getLyricsInfo()) //Artist, Title, Page
                System.out.println(aresult.dump());
        } catch (IOException | NoSuchAlgorithmException | SAXException | ParserConfigurationException e) {
            e.printStackTrace();
        }


//        ArrayList <LyricInfoObject> list=new ArrayList<>();
//        try{
//            UserAgent userAgent = new UserAgent();                       //create new userAgent (headless browser).
//
//            userAgent.visit("http://lyrics.wikia.com/wiki/Lyrics_Wiki");                        //visit a url
//            Element form=userA
// a gent.doc.findFirst("<form action=\"http://lyrics.wikia.com/wiki/Special:Search\" class=\"search-form\" id=\"searchForm\" method=\"get\">");
//            userAgent.doc.getForm(form).set("search","hymn for the weekend").submit();
//            Elements elements=userAgent.doc.findEach("<li class=\"result\">");
//            for (Element element:elements)
//            {
//                LyricInfoObject object=new LyricInfoObject();
//                    Element anchor=element.findFirst("<h1>").findFirst("<a href>");
//                    object.setTitle(anchor.innerHTML());
//                    object.setLink(anchor.getAt("href"));
//                    object.setInfo(null);
//                list.add(object);
////                System.out.println(title);
////                System.out.println(link);
//
//            }
//
////            for (LyricInfoObject object :list)
////            {
////                System.out.println(object.getTitle());
////                System.out.println(object.getLink());
////            }
//            Hyperlink hyperlink=new Hyperlink(new Element("<a href="+list.get(2).getLink()+">"),userAgent);
//            Document document=hyperlink.follow();
//            System.out.println(document.innerHTML());
//
////            String link=userAgent.doc.getHyperlink();
////            System.out.println(link);
////            Elements links = userAgent.doc.findFirst("<div class=\"wikia-paginator\">").findEvery("<a>");  //find search result links
////
////            userAgent.visit(links.getElement(links.size()-1).getAt("href"));
//////            do
//////            {
////                elements=userAgent.doc.findEach("<li class=\"result\">");
////                for (Element element:elements)
////                {
////                    Element anchor=element.findFirst("<h1>").findFirst("<a href>");
////                    String title=anchor.innerHTML();
////                    String link=anchor.getAt("href");
////                    System.out.println(title);
////                    System.out.println(link);
////                }
//
////
////
////            }while (userAgent.doc.nextPageLinkExists());
//
//
//
//          //  System.out.println(userAgent.doc.innerHTML());               //print the document as HTML
//
//
//        }
//        catch(JauntException e){         //if an HTTP/connection error occurs, handle JauntException.
//            System.err.println(e);
//        }

    }
}
