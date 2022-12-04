package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        int forwardCounter = 0;
        int reverseCounter = 0;
        for (int i = startIndex; i < playList.length; i++) {
            if (playList[i].equals(selection)) {
                break;
            }
            else {
                forwardCounter++;
            }
            if(i == playList.length - 1) {
                i = -1;
            }
        }
        for (int i = startIndex; i >= 0; i--) {
            if (playList[i].equals(selection)) {
                break;
            }
            else {
                reverseCounter++;
            }
            if(i == 0) {
                i = playList.length;
            }
        }
        if (forwardCounter > reverseCounter) {
            return reverseCounter;
        }
        else {
            return forwardCounter;
        }
    }
}
