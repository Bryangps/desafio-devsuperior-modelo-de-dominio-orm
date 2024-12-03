package com.desafio.devSuperior.entities;


import jakarta.persistence.*;

import java.time.Instant;
import java.util.Objects;


@Entity
@Table(name = "tb_block")
public class Block {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant start;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant endBlock;

    @ManyToOne
    @JoinColumn(name = "activity_id")
    private Activity activity;

    public Block(){
    }

    public Block(Integer id, Instant start, Instant endBlock, Activity activity) {
        this.id = id;
        this.start = start;
        this.endBlock = endBlock;
        this.activity = activity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Instant getStar() {
        return start;
    }

    public void setStart(Instant start) {
        this.start = start;
    }

    public Instant getEndBlock() {
        return endBlock;
    }

    public void setEndBlock(Instant endBlock) {
        this.endBlock = endBlock;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Block block = (Block) o;
        return Objects.equals(id, block.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}

