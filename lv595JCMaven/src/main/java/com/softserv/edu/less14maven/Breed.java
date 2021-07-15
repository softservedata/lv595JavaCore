package main.java.com.softserv.edu.less14maven;

public enum Breed{
    TAX("tax"),
    DOG("dog"),
    PITBULL("pitbull"),
    BULLDOG("bulldog"),
    CHAOCHAO("chao-chao"),
    SPITZ("spitz");
    private final String breed;

    Breed(String kind){
        breed = kind;
    }

    public String getKind (){
        return breed;
    }

    private Breed nextBreed (){
        if (this == TAX) return DOG;
        if (this == DOG) return PITBULL;
        if (this == PITBULL) return BULLDOG;
        if (this == BULLDOG) return CHAOCHAO;
        if (this == CHAOCHAO) return SPITZ;
         return TAX;

    }

}
