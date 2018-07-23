package com.htp.matrizaev.entity;


public class Leaf implements Component {

    private char leaf;
    private ComponentType componentType;

    public Leaf(char leaf, ComponentType componentType) {
        this.leaf = leaf;
        this.componentType = componentType;
    }

    @Override
    public void addComponent(Component component) {

    }

    @Override
    public ComponentType defineType() {
        return componentType;
    }

    @Override
    public String toString() {
        return String.valueOf(leaf);
    }
}
