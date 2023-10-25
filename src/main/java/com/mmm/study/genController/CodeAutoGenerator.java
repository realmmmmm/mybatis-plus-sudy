//package com.mmm.study.genController;
//import com.baomidou.mybatisplus.annotation.DbType;
//import com.baomidou.mybatisplus.annotation.FieldFill;
//import com.baomidou.mybatisplus.annotation.IdType;
//import com.baomidou.mybatisplus.generator.AutoGenerator;
//import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
//import com.baomidou.mybatisplus.generator.config.GlobalConfig;
//import com.baomidou.mybatisplus.generator.config.PackageConfig;
//import com.baomidou.mybatisplus.generator.config.StrategyConfig;
//import com.baomidou.mybatisplus.generator.config.po.TableFill;
//import com.baomidou.mybatisplus.generator.config.rules.DateType;
//import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
//import java.util.ArrayList;
///**
// * 代码自动生成器
// */
//public class CodeAutoGenerator {
//    public static void main(String[] args) {
//        // 构建一个代码自动生成器对象
//        AutoGenerator mpg = new AutoGenerator();
//        // 配置策略
//        // 1. 全局配置
//        GlobalConfig gc = new GlobalConfig();
//        String projectPath = System.getProperty("user.dir");
//        gc.setOutputDir(projectPath + "\\src\\main\\java");
//        gc.setAuthor("mmm");
//        gc.setOpen(false);
//        // 是否覆盖
//        gc.setFileOverride(false);
//        // 去掉Service I前缀
//        gc.setServiceName("%sService");
//        gc.setIdType(IdType.ASSIGN_ID);
//        gc.setDateType(DateType.ONLY_DATE);
//        gc.setSwagger2(true);
//        mpg.setGlobalConfig(gc);
//        // 2.设置数据源
//        DataSourceConfig dsc = new DataSourceConfig();
//        dsc.setUrl("jdbc:mysql://127.0.0.1:3306/paraglider?useSSL=false&useUnicode=true&characterEncoding=utf-8&serverTimezone=GMT%2B8");
//        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
//        dsc.setUsername("root");
//        dsc.setPassword("root");
//        dsc.setDbType(DbType.MYSQL);
//        mpg.setDataSource(dsc);
//        // 3. 包的配置
//        PackageConfig pc = new PackageConfig();
//        //pc.setModuleName(scanner("模块名"));
//        pc.setParent("com.mmm");
//        pc.setModuleName("study");
//        pc.setEntity("entity");
//        pc.setMapper("mapper");
//        pc.setService("service");
//        pc.setServiceImpl("service.impl");
//        pc.setController("controller");
//        mpg.setPackageInfo(pc);
//        // 4. 策略配置
//        StrategyConfig strategy = new StrategyConfig();
//        strategy.setNaming(NamingStrategy.underline_to_camel);
//        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
//        // 自动设置Lombok
//        strategy.setEntityLombokModel(true);
//        // 配置逻辑删除字段
//        strategy.setLogicDeleteFieldName("deleted");
//        // 自动填充配置
//        TableFill createTime = new TableFill("create_time", FieldFill.INSERT);
//        TableFill updateTime = new TableFill("update_time", FieldFill.INSERT_UPDATE);
//        ArrayList<TableFill> tableFills = new ArrayList<>();
//        tableFills.add(createTime);
//        tableFills.add(updateTime);
//        strategy.setTableFillList(tableFills);
//        // 乐观锁配置
//        strategy.setVersionFieldName("version");
//        strategy.setRestControllerStyle(true);
//        strategy.setControllerMappingHyphenStyle(true);
//        mpg.setStrategy(strategy);
//        mpg.execute();
//    }
//}