import java.lang.*;
class Phone
{
    public void call()
    {
        System.out.println(" YOU CAN CALL A PERSON AND CAN RECEIVE A CALLS FROM A PERSON ALSO: ");  
    }
    public void sms()
    {
        System.out.println(" YOU CAN SEND A TEXT MESSAGE AND RECEIVE THE TEXT MESSAGE ALSO: ");
    }
}
interface Camera
{
    void clickPictures();
    void vedioCall();
    void recordVedios();
}
interface MusicPlayer
{
    void audio();
    void playRecordedAudio();
}
interface Internet
{
    void browser();
    void socialMedias();
    void onlineVedioCall();
}
class SmartPhone extends Phone implements Camera,MusicPlayer,Internet
{
    public void smartphone()
    {
        // TODO Auto-generated method stub
        System.out.println(" YOU CAN PERFORM ALL THE TASKS IN SMART PHONE: ");
    }
    public void clickPictures()
    {
        // TODO Auto-generated method stub
        System.out.println(" YOU CAN TAKE PICTURES IN SMART PHONE: ");
    }
    public void browser() 
    {
        // TODO Auto-generated method stub
        System.out.println(" YOU CAN BROWSE ANY THING USING SEARCH ENGINES IN SMART PHONE: "); 
    }
    public void socialMedias() 
    {
        // TODO Auto-generated method stub
        System.out.println(" YOU CAN USE SOCIAL MEDIAS LIKE INSTA, WHAT'S APP,FB  IN SMART PHONE: ");
    }
    public void onlineVedioCall() 
    {
        // TODO Auto-generated method stub
        System.out.println(" YOU CAN USE SOCIAL MEDIAS LIKE INSTA, WHAT'S APP,FB,VEDIO CONFERENCING APPLICATIONS FOR ONLINE VEDIO CONFERENCING IN SMART PHONE: ");
    }
    public void audio() 
    {
        // TODO Auto-generated method stub
        System.out.println(" YOU CAN USE MUSIC PLAYER APPLICATION TO LISTEN THE AUDIO IN SMART PHONE: ");
    }
    public void playRecordedAudio() 
    {
        // TODO Auto-generated method stub
        System.out.println(" YOU CAN USE MUSIC PLAYER TO LISTEN THE RECORDED AUDIO IN SMART PHONE: ");
    }
    public void vedioCall() 
    {
        // TODO Auto-generated method stub
        System.out.println(" YOU CAN USE SOCIAL MEDIAS LIKE INSTA, WHAT'S APP,FB,VEDIO CONFERENCING APPLICATIONS FOR ONLINE VEDIO CONFERENCING IN SMART PHONE: ");
    }
    public void recordVedios() 
    {
        // TODO Auto-generated method stub
        System.out.println(" YOU CAN USE CAMERA TO RECORDED A VEDIO IN SMART PHONE: ");
    }
}
public class Interphase 
{
    public static void main(String[] arg)
    {
        SmartPhone sp=new SmartPhone();
        sp.audio();
        sp.browser();
        sp.call();
        sp.clickPictures();
        sp.onlineVedioCall();
        sp.playRecordedAudio();
        sp.recordVedios();
        sp.smartphone();
        sp.sms();
        sp.socialMedias();
        sp.vedioCall();
    }
}
