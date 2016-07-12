/Users/user/eclipse.platform.ui/bundles/org.eclipse.core.commands/src/org/eclipse/core/commands/operations/IOperationHistory.java
copyright corporation all rights reserved this program accompanying materials terms eclipse public license accompanies distribution http eclipse org legal epl html contributors corporation initial implementation org eclipse core commands operations org eclipse core commands execution exception org eclipse core internal commands operations global undo context org eclipse core runtime adaptable org eclipse core runtime progress monitor org eclipse core runtime status operation history tracks history operations undone redone operations history initially executed clients choose operations history perform initial execution simply add executed operation history once operations history methods link redo undo context link undo undo context determine operation undo redo undo context context based protocol implies operation undone redone time context this typical linear undo model executed operation undo when protocol linear model enforced history clients determine maintain history invalid stale for operation context performed clients dispose history context additional protocol direct undo redo operation position history when flexible undo model supported methods implemented undo redo operations implementer operation history direct undo redo methods status indicating allowed listeners link operation history listener listen notifications history operations removed notification operation executed undone redone notification operation execution occurs clients direct history execute operation operation executed notification execution link operation approver defines approving undo redo occurs this injecting policy decisions undo model direct undo redo supported warning user kinds operations clients maintain operation determine undo redo conflicts local operation history operation opened closed execution operation opened undo operation opened redo undo context refer global undo history this context intended assigned operations instead querying history performing undo redo entire history operation undo contexts undo context global undo context operation info status describing condition operation redo status operation status status operation status operation status operation redo null operation info status describing condition operation undo status operation status status operation status operation status operation undo null operation error status describing condition operation execution undo redo valid action performed status operation status status operation status operation status operation valid null add operation history executing operation executed time history listeners notified operation history code code param operation operation history add undoable operation operation add approver list operation approvers consulted operation history undo redo attempted param approver operation approver approver instance remove must code null code attempt register instance registered instance method org eclipse core commands operations operation approver add operation approver operation approver approver add listener list operation history listeners notified history operations executed undone redone param listener operation history listener listener must code null code attempt register instance registered instance method org eclipse core commands operations operation history listener org eclipse core commands operations operation history event add operation history listener operation history listener listener close current operation operation completed send listeners code code code code code code notification depending mode otherwise send code code notification add operation history send code code notification any operations executed operation closed longer considered operation this method caller called link open operation param operation code true code operation completed listeners notified code code code code code code code false code operation complete listeners notified code code param add history code true code operation history code false code code operation code parameter code false code operation history param mode mode operation opened can code code code code code code this determines notifications close operation operation add history mode return valid redoable operation context param context context checked code true code redoable operation code false code redo undo context context return valid undoable operation context param context context checked code true code undoable operation code false code undo undo context context dispose context history all operations context disposed references context operations context removed history notification removal operation disposed param context context disposed param flush undo code true code context flushed undo history code false code param flush redo code true code context flushed redo history code false code param flush context code true code context longer references flushed dispose undo context context flush undo flush redo flush context execute operation add operations history successful this method clients operation history listeners receive notifications execution operation execution operation subject approval registered link operation approver execution approved listeners notified code code code code code code operation executes additional notification operation history code code param operation operation executed history param monitor progress monitor code null code operation param info adaptable code null code caller order supply prompting user when parameter code null code minimally adapter org eclipse swt widgets shell status indicating execution succeeded severity code returned status describes operation succeeded history code code severity execute operation successful operation history listeners receive notifications operation success code code operation history code code code code severity user cancelled operation operation history code code severity operation execute history any severity code interpreted history operation history for severities code code listeners receive code code notification code code notification execution approved attempted execution exception exception occurred execution status execute undoable operation operation progress monitor monitor adaptable info execution exception return limit undo redo history context param context context limit requested undo redo history limit context limit undo context context get array operations redo history undo context operations order history undone operation appearing array this history successive redo commands invoked param context context redo array operations history undoable operation redo history undo context context get operation redone undo context param context context redo operation redone code null code operation there guarantee returned operation valid redo undoable operation redo operation undo context context get array operations undo history undo context operations order history operation appearing array this history successive undo commands invoked param context context undo array operations history undoable operation undo history undo context context open composite operation operation operations consider operations subsequently executed operation when operation opened listeners receive notification opened operation specific notification depends mode operation opened code code code code code code notifications execute add operation open occur instead operations current operation note this method intended legacy undo frameworks expect undo operations undo history triggering undo operation when operation open subsequent requests execute add undo redo operation result operation open operation once operation closed composite considered atomic operation clients modify composite adding removing children open when composite open operations history considered open operation operations executed composite open executed composite open operations nested method called operation open presumed application coding error method illegal state exception param operation composite operation considered parent subsequent operations param mode mode operation executing can code code code code code code this determines notifications open operation composite operation operation mode operation changed operation history notify listeners event param operation operation changed operation changed undoable operation operation get operation undone undo context param context context undo operation undone code null code operation there guarantee operation valid undo undoable operation undo operation undo context context redo undone operation context redo operation subject approval registered link operation approver attempted param context context redone param monitor progress monitor redo code null code progress monitor param info adaptable code null code caller order supply prompting user when parameter code null code minimally adapter org eclipse swt widgets shell status indicating redo succeeded severity code returned status describes operation succeeded remains history code code severity redo operation successful release operation undo history prior redone operation undo history undone since relaxed redone operations undo history listeners receive code code notification other severity codes code code code code code code interpreted history operation remain history returned status simply passed caller for severities code code listeners receive code code notification code code notification redo approved attempted execution exception exception occurred redo status redo undo context context progress monitor monitor adaptable info execution exception redo operation redo operation subject approval registered link operation approver attempted param operation operation redone param monitor progress monitor redo code null code progress monitor param info adaptable code null code caller order supply prompting user when parameter code null code minimally adapter org eclipse swt widgets shell status indicating redo succeeded severity code returned status describes operation succeeded remains history code code severity redo operation successful release operation undo history prior redone operation undo history undone since relaxed redone operations undo history listeners receive code code notification other severity codes code code code code code code interpreted history operation remain history returned status simply passed caller for severities code code listeners receive code code notification code code notification redo approved attempted execution exception exception occurred redo status redo operation undoable operation operation progress monitor monitor adaptable info execution exception remove operation approver list operation approvers consulted operation undone redone param approver operation approver removed must code null code attempt remove instance registered instance method remove operation approver operation approver approver remove listener list operation history listeners param listener operation history listener removed must code null code attempt remove instance registered instance method remove operation history listener operation history listener listener replace operation undo redo history list replacements this protocol typically composite broken atomic parts replacements inserted replacement replacements undone redone listeners notified removal replaced element addition replacement param operation undoable operation replaced param replacements array undoable operation replace operation replace operation undoable operation operation undoable operation replacements set limit undo redo history context param context context limit set param limit maximum number operations undo redo history context must negative set limit undo context context limit undo executed operation context undo operation subject approval registered link operation approver attempted param context context undone param monitor progress monitor undo code null code progress monitor param info adaptable code null code caller order supply prompting user when parameter code null code minimally adapter org eclipse swt widgets shell status indicating undo succeeded severity code returned status describes operation succeeded remains history code code severity undo operation successful release operation redo history prior undone operation redo history redone since relaxed undone operations redo history listeners receive code code notification other severity codes code code code code code code interpreted history operation remain history returned status simply passed caller for severities code code listeners receive code code notification code code notification undo approved attempted execution exception exception occurred undo status undo undo context context progress monitor monitor adaptable info execution exception undo operation undo operation subject approval registered link operation approver attempted param operation operation undone param monitor progress monitor undo code null code progress monitor param info adaptable code null code caller order supply prompting user when parameter code null code minimally adapter org eclipse swt widgets shell status indicating undo succeeded severity code returned status describes operation succeeded remains history code code severity undo operation successful release operation redo history prior undone operation redo history redone since relaxed undone operations redo history listeners receive code code notification other severity codes code code code code code code interpreted history operation remain history returned status simply passed caller for severities code code listeners receive code code notification code code notification undo approved attempted execution exception exception occurred undo status undo operation undoable operation operation progress monitor monitor adaptable info execution exception