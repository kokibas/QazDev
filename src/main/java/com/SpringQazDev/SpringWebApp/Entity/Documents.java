package com.SpringQazDev.SpringWebApp.Entity;

import org.hibernate.Session;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "documents")
public class Documents {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "content")
    private String content;

    public Documents() {
    }

    public Documents(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public static List<Documents> searchByContent(String searchText) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("your-persistence-unit-name");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            String query = "SELECT d FROM Documents d WHERE d.content LIKE :searchText";
            List<Documents> documents = entityManager.createQuery(query, Documents.class)
                    .setParameter("searchText", "%" + searchText + "%")
                    .getResultList();
            return documents;
        } finally {
            entityManager.close();
            entityManagerFactory.close();
        }
    }
}
