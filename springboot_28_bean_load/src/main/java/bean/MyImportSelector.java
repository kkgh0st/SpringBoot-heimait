package bean;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        try {
            Class<?> clazz = Class.forName("bean.Wolf");
            if(clazz != null)
            {
                return new String[]{"bean.Cat"};
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return new String[0];
        }

        return null;
    }
}
