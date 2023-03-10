package org.example.model;

import jakarta.persistence.*;

@Entity
@Table(name = "cats")
public class Cat {

    @Id @GeneratedValue
    private Long id;
    @Column(name = "imya")
    private String name;
    private int weight;
    private boolean isAngry;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "miska_id")
//    private Bowl bowl;

//    @ManyToOne()
//    private Bowl bowl;
//
//    public Bowl getBowl() {
//        return bowl;
//    }
//
//    public void setBowl(Bowl bowl) {
//        this.bowl = bowl;
//    }

    protected Cat() {}

    public Cat(String name, int weight, boolean isAngry) {
        this.name = name;
        this.weight = weight;
        this.isAngry = isAngry;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isAngry() {
        return isAngry;
    }

    public void setAngry(boolean angry) {
        isAngry = angry;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", isAngry=" + isAngry +
//                ", bowl=" + bowl +
                '}';
    }
}
