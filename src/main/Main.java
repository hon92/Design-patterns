/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import patterns.decorator.DecoratorDemo;
import patterns.abstractfactory.AbstractFactoryDemo;
import patterns.adapter.AdapterDemo;
import patterns.command.CommandDemo;
import patterns.composite.CompositeDemo;
import patterns.fasade.FasadeDemo;
import patterns.iterator.IteratorDemo;
import patterns.observer.ObserverDemo;
import patterns.proxy.ProxyDemo;
import patterns.state.StateDemo;
import patterns.strategy.BasicAlgorithm;
import patterns.strategy.StrategyDemo;
import patterns.templatemethod.Pizza;
import patterns.templatemethod.TemplateMethodDemo;
import patterns.visitor.VisitorDemo;

/**
 *
 * @author Honza
 */
public class Main {
    public static void main(String[] args) {
        StrategyDemo strategyDemo = new StrategyDemo(new BasicAlgorithm());
        strategyDemo.start();
        
        TemplateMethodDemo templateMethodDemo = new TemplateMethodDemo(new Pizza());
        templateMethodDemo.start();
        
        ObserverDemo observerDemo = new ObserverDemo();
        observerDemo.start();
        
        DecoratorDemo decoratorDemo = new DecoratorDemo();
        decoratorDemo.start();
        
        VisitorDemo visitorDemo = new VisitorDemo();
        visitorDemo.start();
        
        AbstractFactoryDemo factoryDemo = new AbstractFactoryDemo();
        factoryDemo.start();
        
        CommandDemo commandDemo = new CommandDemo();
        commandDemo.start();
        
        AdapterDemo adapterDemo = new AdapterDemo();
        adapterDemo.start();
        
        FasadeDemo fasadeDemo = new FasadeDemo();
        fasadeDemo.start();
        
        IteratorDemo iteratorDemo = new IteratorDemo();
        iteratorDemo.start();
        
        CompositeDemo compositeDemo = new CompositeDemo();
        compositeDemo.start();
        
        StateDemo stateDemo = new StateDemo();
        stateDemo.start();
        
        ProxyDemo proxyDemo = new ProxyDemo();
        proxyDemo.start();
    }
}
