package com.github.youssfbr.card.entities;

import com.github.youssfbr.card.dtos.FoodRequestDTO;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.beans.BeanUtils;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Table(name = "tb_foods")
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String name;

    @Column(columnDefinition = "text")
    private String image;

    @Column(nullable = false)
    private BigDecimal price;

    public Food(FoodRequestDTO data) {
        BeanUtils.copyProperties(data, this);
    }

}
