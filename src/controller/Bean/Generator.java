package controller.Bean;

import lombok.experimental.UtilityClass;
import module.Bean;

import java.util.*;

@UtilityClass
public class Generator {

    public List<Bean> fill(List<Bean> can, int amountOfBeans) {
        Bean whiteBean = Bean.builder().colour("white").build();
        Bean blackBean = Bean.builder().colour("black").build();
        List<Bean> beans = new ArrayList<>();
        beans.add(whiteBean);
        beans.add(blackBean);
        while (can.size() <= amountOfBeans) {
            Collections.shuffle(beans);
            can.add(beans.get(0));
        }
        return can;
    }
}