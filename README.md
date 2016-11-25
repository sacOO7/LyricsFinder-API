# LyricsFinder
Lyrics downloader API in java

Download [dependency jar]()

### How to use?

```java

            try {
                    for(LyricInfo aresult : ViewLyricsSearcher.search("westlife","my love", 1).getLyricsInfo()) //Artist, Title, Page
                        System.out.println(aresult.dump());
                } catch (IOException | NoSuchAlgorithmException | SAXException | ParserConfigurationException e) {
                    e.printStackTrace();
                }
```                

