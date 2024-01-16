package com.ll.synergarette.boundedContext.order.entity;

import com.ll.synergarette.boundedContext.goods.entity.Goods;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.aspectj.weaver.ast.Or;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class OrderItem {
    @ManyToOne
    private Order order;

    private LocalDateTime payDate;

    @ManyToOne
    private Goods goods;

}