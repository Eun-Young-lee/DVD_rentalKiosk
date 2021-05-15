package searchMovie;


public class ShowMovie {
    private String title;
    private String code;
    private String genr;

    ShowMovie() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getGenr() {
        return genr;
    }

    public void setGenr(String genr) {
        this.genr = genr;
    }

    @Override
    public String toString() {
        return "ShowMovie{" + "title=" + title + ", code=" + code + ", genr=" + genr + '}';
    }

    public ShowMovie(String title) {
        this.title = title;
    }

    String setTitle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
