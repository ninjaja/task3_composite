package com.htp.matrizaev.entity;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    private List<Component> componentList;
    private ComponentType componentType;

    public Composite(ComponentType componentType) {
        this.componentList = new ArrayList<>();
        this.componentType = componentType;
    }

    @Override
    public void addComponent(Component component) {
        componentList.add(component);
    }

    @Override
    public ComponentType defineType() {
        return componentType;
    }

    public void remove(Component component) {
        componentList.remove(component);
    }

    public List<Component> getComponents() {
        return componentList;
    }

    public ComponentType getComponentType() {
        return componentType;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Component component : componentList) {
            if (component.defineType() == componentType.PARAGRAPH) {
                stringBuilder.append("   ");
            }
            if (component.defineType() == componentType.LEXEME) {
                stringBuilder.append(" ");
            }
            stringBuilder.append(component.toString());
        }
        return stringBuilder.toString();
    }
}
