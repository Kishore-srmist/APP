interface Confidential {
}

class PublicDocument {
    String name;

    PublicDocument(String name) {
        this.name = name;
    }
}

class PrivateDocument implements Confidential {
    String name;

    PrivateDocument(String name) {
        this.name = name;
    }
}

class OfficialDocument implements Confidential {
    String name;

    OfficialDocument(String name) {
        this.name = name;
    }
}

public class DocumentManagement {
    public static void main(String[] args) {

        Object[] documents = {
            new PublicDocument("News"),
            new PrivateDocument("Personal File"),
            new OfficialDocument("Government File")
        };

        for (Object doc : documents) {

            if (doc instanceof Confidential) {
                System.out.println("Confidential Document");
            } else {
                System.out.println("Public Document");
            }
        }
    }
}
