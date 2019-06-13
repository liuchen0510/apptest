Action()
{

	web_url("1", 
		"URL=http://10.7.90.40:8033/bugfree3/index.php/bug/list/1", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=", 
		"Snapshot=t1.inf", 
		"Mode=HTML", 
		EXTRARES, 
		"Url=/bugfree3/themes/classic/assets/images/blue/seperate_line.png", "Referer=http://10.7.90.40:8033/bugfree3/index.php/site/login", ENDITEM, 
		"Url=/bugfree3/themes/classic/assets/images/blue/logo_login.png", "Referer=http://10.7.90.40:8033/bugfree3/index.php/site/login", ENDITEM, 
		LAST);
    
	lr_start_transaction("bug1");

	web_submit_data("login", 
		"Action=http://10.7.90.40:8033/bugfree3/index.php/site/login", 
		"Method=POST", 
		"TargetFrame=", 
		"RecContentType=text/html", 
		"Referer=http://10.7.90.40:8033/bugfree3/index.php/site/login", 
		"Snapshot=t2.inf", 
		"Mode=HTML", 
		ITEMDATA, 
		"Name=LoginForm[username]", "Value={name}", ENDITEM, 
		"Name=LoginForm[password]", "Value={pwd}", ENDITEM, 
		"Name=LoginForm[language]", "Value=zh_cn", ENDITEM, 
		"Name=LoginForm[rememberMe]", "Value=0", ENDITEM, 
		"Name=LoginForm[rememberMe]", "Value=1", ENDITEM, 
		EXTRARES, 
		"Url=/bugfree3/themes/classic/assets/images/down.gif", "Referer=http://10.7.90.40:8033/bugfree3/index.php/bug/list/1", ENDITEM, 
		"Url=/bugfree3/themes/classic/assets/images/active.png", "Referer=http://10.7.90.40:8033/bugfree3/index.php/bug/list/1", ENDITEM, 
		"Url=/bugfree3/themes/classic/assets/images//close_div.gif", "Referer=http://10.7.90.40:8033/bugfree3/index.php/bug/list/1", ENDITEM, 
		"Url=/bugfree3/assets/6ac6ee64/jui/css/base/images/ui-bg_flat_75_ffffff_40x100.png", "Referer=http://10.7.90.40:8033/bugfree3/index.php/bug/list/1", ENDITEM, 
		"Url=/bugfree3/assets/6ac6ee64/jui/css/base/images/ui-icons_222222_256x240.png", "Referer=http://10.7.90.40:8033/bugfree3/index.php/bug/list/1", ENDITEM, 
		"Url=/bugfree3/assets/6ac6ee64/jui/css/base/images/ui-bg_highlight-soft_75_cccccc_1x100.png", "Referer=http://10.7.90.40:8033/bugfree3/index.php/bug/list/1", ENDITEM, 
		"Url=/bugfree3/assets/eb62f111/img/page.gif", "Referer=http://10.7.90.40:8033/bugfree3/index.php/bug/list/1", ENDITEM, 
		LAST);

	web_submit_data("getProductModule", 
		"Action=http://10.7.90.40:8033/bugfree3/index.php/search/getProductModule", 
		"Method=POST", 
		"TargetFrame=", 
		"RecContentType=text/html", 
		"Referer=http://10.7.90.40:8033/bugfree3/index.php/bug/list/1", 
		"Snapshot=t3.inf", 
		"Mode=HTML", 
		ITEMDATA, 
		"Name=product_id", "Value=1", ENDITEM, 
		"Name=productmodule_id", "Value=0", ENDITEM, 
		LAST);

	lr_think_time(10);

	web_url("edit", 
		"URL=http://10.7.90.40:8033/bugfree3/index.php/info/edit?type=bug&action=opened&product_id=1", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://10.7.90.40:8033/bugfree3/index.php/bug/list/1", 
		"Snapshot=t4.inf", 
		"Mode=HTML", 
		EXTRARES, 
		"Url=/bugfree3/themes/classic/assets/images/active.png", "Referer=http://10.7.90.40:8033/bugfree3/index.php/info/edit?type=bug&action=opened&product_id=1", ENDITEM, 
		"Url=/bugfree3/assets/6ac6ee64/jui/css/base/images/ui-bg_flat_75_ffffff_40x100.png", "Referer=http://10.7.90.40:8033/bugfree3/index.php/info/edit?type=bug&action=opened&product_id=1", ENDITEM, 
		"Url=/bugfree3/assets/6ac6ee64/jui/css/base/images/ui-bg_highlight-soft_75_cccccc_1x100.png", "Referer=http://10.7.90.40:8033/bugfree3/index.php/info/edit?type=bug&action=opened&product_id=1", ENDITEM, 
		"Url=/bugfree3/assets/6ac6ee64/jui/css/base/images/ui-icons_222222_256x240.png", "Referer=http://10.7.90.40:8033/bugfree3/index.php/info/edit?type=bug&action=opened&product_id=1", ENDITEM, 
		"Url=/bugfree3/assets/2e776087/themes/default/default.css", "Referer=http://10.7.90.40:8033/bugfree3/index.php/info/edit?type=bug&action=opened&product_id=1", ENDITEM, 
		"Url=/bugfree3/assets/2e776087/themes/default/default.png", "Referer=http://10.7.90.40:8033/bugfree3/index.php/info/edit?type=bug&action=opened&product_id=1", ENDITEM, 
		LAST);

	lr_think_time(49);

	web_custom_request("userList", 
		"URL=http://10.7.90.40:8033/bugfree3/index.php/search/userList?p=-1&q=&limit=60&timestamp=1558939335090", 
		"Method=GET", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://10.7.90.40:8033/bugfree3/index.php/info/edit?type=bug&action=opened&product_id=1", 
		"Snapshot=t5.inf", 
		"Mode=HTML", 
		"EncType=application/x-www-form-urlencoded", 
		EXTRARES, 
		"Url=/bugfree3/assets/f7198d0a/indicator.gif", "Referer=http://10.7.90.40:8033/bugfree3/index.php/info/edit?type=bug&action=opened&product_id=1", ENDITEM, 
		LAST);

	web_add_cookie("ac-cookie=%5B%7B%22data%22%3A%5B%22%E7%B3%BB%E7%BB%9F%E7%AE%A1%E7%90%86%E5%91%98%22%2C%22%E7%B3%BB%E7%BB%9F%E7%AE%A1%E7%90%86%E5%91%98%5Badmin%5D%22%5D%2C%22value%22%3A%22%E7%B3%BB%E7%BB%9F%E7%AE%A1%E7%90%86%E5%91%98%22%2C%22result%22%3A%22%E7%B3%BB%E7%BB%9F%E7%AE%A1%E7%90%86%E5%91%98%22%7D%5D; DOMAIN=10.7.90.40");

	lr_think_time(66);

	web_custom_request("userList_2", 
		"URL=http://10.7.90.40:8033/bugfree3/index.php/search/userList?q=%E7%B3%BB%E7%BB%9F%E7%AE%A1%E7%90%86&limit=60&timestamp=1558939401090", 
		"Method=GET", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://10.7.90.40:8033/bugfree3/index.php/info/edit?type=bug&action=opened&product_id=1", 
		"Snapshot=t6.inf", 
		"Mode=HTML", 
		"EncType=application/x-www-form-urlencoded", 
		LAST);

	lr_think_time(175);

	web_submit_data("edit_2", 
		"Action=http://10.7.90.40:8033/bugfree3/index.php/info/edit?type=bug&action=opened&product_id=1", 
		"Method=POST", 
		"EncType=multipart/form-data", 
		"TargetFrame=", 
		"RecContentType=text/html", 
		"Referer=http://10.7.90.40:8033/bugfree3/index.php/info/edit?type=bug&action=opened&product_id=1", 
		"Snapshot=t7.inf", 
		"Mode=HTML", 
		ITEMDATA, 
		"Name=BugInfoView[deleted_file_id]", "Value=", ENDITEM, 
		"Name=BugInfoView[lock_version]", "Value=", ENDITEM, 
		"Name=BugInfoView[product_id]", "Value=1", ENDITEM, 
		"Name=isPageDirty", "Value=1", ENDITEM, 
		"Name=templateTitle", "Value=", ENDITEM, 
		"Name=BugInfoView[title]", "Value={bug}", ENDITEM, 
		"Name=layer1_module", "Value=0", ENDITEM, 
		"Name=BugInfoView[productmodule_id]", "Value=0", ENDITEM, 
		"Name=BugInfoView[assign_to_name]", "Value={a}", ENDITEM, 
		"Name=BugInfoView[mail_to]", "Value={b} ENDITEM, 
		"Name=BugInfoView[severity]", "Value={n}", ENDITEM, 
		"Name=BugInfoView[priority]", "Value={n1}", ENDITEM, 
		"Name=Custom[BugType]", "Value={b}��", ENDITEM, 
		"Name=Custom[HowFound]", "Value={c}", ENDITEM, 
		"Name=Custom[BugOS]", "Value={d}", ENDITEM, 
		"Name=Custom[BugBrowser]", "Value={e}", ENDITEM, 
		"Name=Custom[OpenedBuild]", "Value=d{describe}", ENDITEM, 
		"Name=Custom[ResolvedBuild]", "Value=", ENDITEM, 
		"Name=Custom[BugSubStatus]", "Value=", ENDITEM, 
		"Name=Custom[BugMachine]", "Value=", ENDITEM, 
		"Name=Custom[BugKeyword]", "Value=", ENDITEM, 
		"Name=BugInfoView[related_bug]", "Value=", ENDITEM, 
		"Name=BugInfoView[related_case]", "Value=", ENDITEM, 
		"Name=BugInfoView[related_result]", "Value=", ENDITEM, 
		"Name=attachment_file[]", "Value=", "File=Yes", ENDITEM, 
		"Name=BugInfoView[action_note]", "Value=", ENDITEM, 
		"Name=BugInfoView[repeat_step]", "Value=[步骤]<br />\r\n1.<br />\r\n2.<br />\r\n<br />\r\n[结果]<br />\r\n<br />\r\n[期望]<br />\r\n<br />\r\n[备注]<br />\r\n<br />", ENDITEM, 
		LAST);

	web_url("BugFree", 
		"URL=http://10.7.90.40:8033/bugfree3/index.php/bug/list/1", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=", 
		"Snapshot=t8.inf", 
		"Mode=HTML", 
		EXTRARES, 
		"Url=/bugfree3/themes/classic/assets/images/down.gif", ENDITEM, 
		"Url=/bugfree3/themes/classic/assets/images//close_div.gif", ENDITEM, 
		"Url=/bugfree3/assets/eb62f111/img/page.gif", ENDITEM, 
		LAST);

	web_url("Bug", 
		"URL=http://10.7.90.40:8033/bugfree3/index.php/bug/1140", 
		"TargetFrame=_blank", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=", 
		"Snapshot=t9.inf", 
		"Mode=HTML", 
		LAST);

	web_url("getPreNextId", 
		"URL=http://10.7.90.40:8033/bugfree3/index.php/search/getPreNextId?id=1140&type=bug&product_id=1", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://10.7.90.40:8033/bugfree3/index.php/bug/1140", 
		"Snapshot=t10.inf", 
		"Mode=HTML", 
		LAST);

	web_submit_data("getProductModule_2", 
		"Action=http://10.7.90.40:8033/bugfree3/index.php/search/getProductModule", 
		"Method=POST", 
		"TargetFrame=", 
		"RecContentType=text/html", 
		"Referer=http://10.7.90.40:8033/bugfree3/index.php/bug/list/1", 
		"Snapshot=t11.inf", 
		"Mode=HTML", 
		ITEMDATA, 
		"Name=product_id", "Value=1", ENDITEM, 
		"Name=productmodule_id", "Value=0", ENDITEM, 
		LAST);

    web_find("web_find",
	"What=Welcome",
	LAST);

	lr_end_transaction("bug1", LR_AUTO);

	return 0;
}