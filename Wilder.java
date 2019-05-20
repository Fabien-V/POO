public class Wilder {


    private String name;
    private boolean aware;

    public Wilder(String name,boolean aware) {
        this.name = name;
        this.aware = false;
    }

    public boolean isAware() {
        return this.aware;
    }

    public String getName() {
        return this.name;
    }

    public String whoAmI(){

        if (aware = true){
            return "Je m'appelle " + this.getName() + " et je suis aware";
        }
        else{
            return "Je m'appelle " + this.getName() + " et je ne suis pas aware";
        }
    }
}
