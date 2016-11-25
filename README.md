# LyricsFinder API

Download [dependency jar](https://github.com/sacOO7/LyricsFinder-API/blob/master/out/artifacts/LyricsParser_jar/LyricsParser.jar?raw=true)

### How to use?

```java

            try {
                    for(LyricInfo aresult : ViewLyricsSearcher.search("westlife","my love", 1).getLyricsInfo()) //Artist, Title, Page
                        System.out.println(aresult.dump());
                } catch (IOException | NoSuchAlgorithmException | SAXException | ParserConfigurationException e) {
                    e.printStackTrace();
                }
```                

