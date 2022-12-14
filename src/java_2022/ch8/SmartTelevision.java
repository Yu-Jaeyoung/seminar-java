package java_2022.ch8;

public class SmartTelevision implements RemoteControl, Searchable{
    private int volume;

    // RemoteControl의 추상 메소드에 대한 실체 메소드
    public void turnOn(){
        System.out.println("Tv On");
    }

    public void turnOff(){
        System.out.println("Tv Off");
    }
    public void setVolume(int volume){
        if(volume> MAX_VOLUME){
            this.volume = MAX_VOLUME;
        } else if (volume< MIN_VOLUME) {
            this.volume = MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("Tv volume : " + volume);
    }
    // Searchable의 추상 메소드에 대한 실체 메소드
    public void search(String url){
        System.out.println(url + "searching... ");
    }
}
