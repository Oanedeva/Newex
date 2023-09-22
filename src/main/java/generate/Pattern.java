package generate;

public class Pattern {
    private int r;
    public int c;
    private Pattern(int rar){
        this.r=rar;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    private static Pattern name;
    public static Pattern getInstance(int r)
    {
        if (name == null) {
            name = new Pattern(r);
        }
        return (name);
    }
}
