/Users/user/eclipse.platform.ui/bundles/org.eclipse.core.commands/src/org/eclipse/core/commands/operations/UndoContext.java
copyright corporation all rights reserved this program accompanying materials terms eclipse public license accompanies distribution http eclipse org legal epl html contributors corporation initial implementation org eclipse core commands operations simple lightweight undo context tag operation specialized label this instantiated clients this subclassed undo context undo context get label describes undo context implementation returns empty string subclasses override label context override string label return context considered match receiving context when context matches context operations context considered matching context implementation checks supplied context identical context subclasses override param context context checked receiving context code true code receiving context considered match context code false code override matches undo context context context