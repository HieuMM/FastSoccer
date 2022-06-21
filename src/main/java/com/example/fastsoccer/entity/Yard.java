package com.example.fastsoccer.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "yard")
@Entity
public class Yard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "detail")
    private String detail;
    @ManyToOne
    @JoinColumn(name = "ownpitch_id") // thông qua khóa ngoại
    private OwnPitch ownPitch;
    @OneToMany(mappedBy = "yardId", cascade = CascadeType.ALL)
    private List<PriceYard> priceYardList;
}
