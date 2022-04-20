package bean;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        System.out.println(" 提示:" + importingClassMetadata.getClassName());
        System.out.println("提示2:"+importingClassMetadata.hasAnnotation("org.springframework.context.annotation.Configuration"));

        // 各种条件的判断，判断完毕后，决定是否装在制定的bean
        boolean flag = importingClassMetadata.hasAnnotation("org.springframework.context.annotation.Configuration");
        if(flag){
            return new String[]{"bean.Cat"};
        }else{
            return new String[]{"bean.Dog"};
        }
    }
}
