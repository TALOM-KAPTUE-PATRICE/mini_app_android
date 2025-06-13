package cm.GL2b.myfirstappgl2b.modele;

public class Module {
    private int id;
    private String accronym;
    private String name;
    private String description;
   private  int credit;
   public  Module(int id,String accronym,String name,String description, int credit){
       this.id=id;
       this.accronym=accronym;
       this.name=name;
       this.description=description;
       this.credit=credit;
   }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccronym() {
        return accronym;
    }

    public void setAccronym(String accronym) {
        this.accronym = accronym;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }
}
