<?php include(pe_tpl('header.html'));?>
<div class="right">
	<div class="now">
		<a href="admin.php?mod=moban" <?php if($act!='shop'):?>class="sel"<?php endif;?>>模板列表</a>
		<div class="clear"></div>
	</div>
	<div class="right_main">
		<div class="tip mab5" id="jindu_load" style="display:none"><img src="<?php echo $pe['host_root'] ?>include/image/load_mini.gif" class="fl" /><span class="fl strong font16 corg mat10 mal10">模板正在安装中，请稍后...</span><div class="clear"></div></div>
		<div class="tip mab5" id="jindu_dui" style="display:none"><img src="<?php echo $pe['host_root'] ?>include/image/tip_dui.png" class="fl" /><span class="fl strong font16 cgreen mat10 mal10">恭喜，模板安装成功！</span><div class="clear"></div></div>
		<div class="tip mab5" id="jindu_cuo" style="display:none"><img src="<?php echo $pe['host_root'] ?>include/image/tip_cuo.png" class="fl" /><span class="fl strong font16 cred mat10 mal10">模板安装失败...<span id="jindu_cuo_text" class="mal5"></span></span><div class="clear"></div></div>
		<?php if($act=='shop'):?>
		<div class="admin_t_info">
			<div class="banben">
				<iframe width="100%" height="755px" frameborder="0" src="http://www.phpshe.com/shop/list"></iframe>
			</div>
		</div>
		<?php else:?>
		<table border="0" cellspacing="0" cellpadding="0" class="list">
		<tr>
			<th class="bgtt" width="80">序号</th>
			<th class="bgtt" width="250"></th>
			<th class="bgtt" width="300">模板名称</th>
			<th class="bgtt">路径</th>
			<th class="bgtt" width="100">操作</th>
		</tr>
		<?php foreach($info_list as $k=>$v):?>
		<?php $moban_config = moban_config($v)?>
		<tr>
			<td class="num"><?php echo $k+1 ?></td>
			<td style="padding:10px 7px"><img src="<?php echo pe_thumb('template/'.$v.'/index/preview.jpg') ?>" style="width:120px;height:90px" class="imgbg" /></td>	
			<td><?php echo $moban_config['moban_name'] ?></td>
			<td class="aleft">./template/<?php echo $v ?>/</td>
			<td>
				<?php if($v == $moban_now):?>
				<span class="cred">使用中</span>
				<?php else:?>
				<a href="admin.php?mod=moban&act=setting&tpl=<?php echo $v ?>&token=<?php echo $pe_token ?>" class="admin_edit mar3">使用</a>
				<a href="admin.php?mod=moban&act=del&tpl=<?php echo $v ?>&token=<?php echo $pe_token ?>" class="admin_del" onclick="return pe_cfone(this, '删除')">删除</a>
				<?php endif;?>
			</td>
		</tr>
		<?php endforeach;?>
		</table>
		<?php endif;?>
	</div>
</div>
<script type="text/javascript">
$(function(){
$(".mb_list").hover(
	function(){
		$(this).find("a").show();
	},
	function(){
		$(this).find("a").hide();					
	}
)
$.getJSON("http://www.phpshe.com/index.php?mod=api&act=moban_url&callback=?", function(json){
	alert(json.html);
})
if ("<?php echo $act ?>" == 'install') {
	$("#jindu_load").show();
	$.ajaxSettings.async = false;
	$.getJSON("<?php echo $pe['host_root'] ?>admin.php", {"mod":"moban", "act":"down", "id":"<?php echo $_g_id ?>"}, function(json){
		$("#jindu_load").hide();
		if (json.result) {
			$("#jindu_dui").show();
		}
		else {
			$("#jindu_cuo").show();
			$("#jindu_cuo_text").html(json.show);	
		}
		setTimeout(function(){
			window.location.href = "admin.php?mod=moban";
		}, 3000)
	})
}
})
</script>
<?php include(pe_tpl('footer.html'));?>