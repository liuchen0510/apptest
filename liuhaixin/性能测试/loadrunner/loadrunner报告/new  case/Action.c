Action()
{

	web_add_cookie("1_product=9e40f4f8ac90faa0dbba40b3445698512887b09as%3A1%3A%221%22%3B; DOMAIN=10.7.90.205");

	web_add_cookie("pageSize=601e6f18f0f7d75f725d1c40e3c57164989e2c3as%3A2%3A%2220%22%3B; DOMAIN=10.7.90.205");

	web_add_cookie("ac-cookie=%5B%7B%22data%22%3A%5B%22%E7%B3%BB%E7%BB%9F%E7%AE%A1%E7%90%86%E5%91%98%22%2C%22%E7%B3%BB%E7%BB%9F%E7%AE%A1%E7%90%86%E5%91%98%5Badmin%5D%22%5D%2C%22value%22%3A%22%E7%B3%BB%E7%BB%9F%E7%AE%A1%E7%90%86%E5%91%98%22%2C%22result%22%3A%22%E7%B3%BB%E7%BB%9F%E7%AE%A1%E7%90%86%E5%91%98%22%7D%5D; DOMAIN=10.7.90.205");

	web_add_cookie("language=0a2b4a62849989ee73f383f7dc48db485efcaca8s%3A5%3A%22zh_cn%22%3B; DOMAIN=10.7.90.205");

	web_url("login", 
		"URL=http://10.7.90.205/bugfree3.0.3/index.php/site/login", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=", 
		"Snapshot=t1.inf", 
		"Mode=HTML", 
		EXTRARES, 
		"Url=/bugfree3.0.3/themes/classic/assets/images/blue/seperate_line.png", ENDITEM, 
		"Url=/bugfree3.0.3/themes/classic/assets/images/blue/logo_login.png", ENDITEM, 
		LAST);

	lr_start_transaction("login");

	web_submit_form("login_2", 
		"Snapshot=t2.inf", 
		ITEMDATA, 
		"Name=LoginForm[username]", "Value=admin", ENDITEM, 
		"Name=LoginForm[password]", "Value=123456", ENDITEM, 
		"Name=LoginForm[language]", "Value=简体中文", ENDITEM, 
		"Name=LoginForm[rememberMe]", "Value=1", ENDITEM, 
		EXTRARES, 
		"Url=/bugfree3.0.3/themes/classic/assets/images/down.gif", "Referer=http://10.7.90.205/bugfree3.0.3/index.php/bug/list/1", ENDITEM, 
		"Url=/bugfree3.0.3/themes/classic/assets/images/active.png", "Referer=http://10.7.90.205/bugfree3.0.3/index.php/bug/list/1", ENDITEM, 
		"Url=/bugfree3.0.3/themes/classic/assets/images//close_div.gif", "Referer=http://10.7.90.205/bugfree3.0.3/index.php/bug/list/1", ENDITEM, 
		"Url=/bugfree3.0.3/assets/10643704/jui/css/base/images/ui-bg_flat_75_ffffff_40x100.png", "Referer=http://10.7.90.205/bugfree3.0.3/index.php/bug/list/1", ENDITEM, 
		"Url=/bugfree3.0.3/assets/10643704/jui/css/base/images/ui-bg_highlight-soft_75_cccccc_1x100.png", "Referer=http://10.7.90.205/bugfree3.0.3/index.php/bug/list/1", ENDITEM, 
		"Url=/bugfree3.0.3/assets/10643704/jui/css/base/images/ui-icons_222222_256x240.png", "Referer=http://10.7.90.205/bugfree3.0.3/index.php/bug/list/1", ENDITEM, 
		"Url=/bugfree3.0.3/assets/4b9d3645/img/page.gif", "Referer=http://10.7.90.205/bugfree3.0.3/index.php/bug/list/1", ENDITEM, 
		LAST);

	web_submit_data("getProductModule", 
		"Action=http://10.7.90.205/bugfree3.0.3/index.php/search/getProductModule", 
		"Method=POST", 
		"RecContentType=text/html", 
		"Referer=http://10.7.90.205/bugfree3.0.3/index.php/bug/list/1", 
		"Snapshot=t3.inf", 
		"Mode=HTML", 
		ITEMDATA, 
		"Name=product_id", "Value=1", ENDITEM, 
		"Name=productmodule_id", "Value=0", ENDITEM, 
		LAST);

	lr_end_transaction("login",LR_AUTO);

	lr_think_time(19);

	web_url("1", 
		"URL=http://10.7.90.205/bugfree3.0.3/index.php/case/list/1", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://10.7.90.205/bugfree3.0.3/index.php/bug/list/1", 
		"Snapshot=t4.inf", 
		"Mode=HTML", 
		EXTRARES, 
		"Url=/bugfree3.0.3/assets/4b9d3645/img/page.gif", ENDITEM, 
		LAST);

	web_submit_data("getProductModule_2", 
		"Action=http://10.7.90.205/bugfree3.0.3/index.php/search/getProductModule", 
		"Method=POST", 
		"RecContentType=text/html", 
		"Referer=http://10.7.90.205/bugfree3.0.3/index.php/case/list/1", 
		"Snapshot=t5.inf", 
		"Mode=HTML", 
		ITEMDATA, 
		"Name=product_id", "Value=1", ENDITEM, 
		"Name=productmodule_id", "Value=0", ENDITEM, 
		LAST);

	web_url("edit", 
		"URL=http://10.7.90.205/bugfree3.0.3/index.php/info/edit?type=case&action=opened&product_id=1", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://10.7.90.205/bugfree3.0.3/index.php/case/list/1", 
		"Snapshot=t6.inf", 
		"Mode=HTML", 
		EXTRARES, 
		"Url=/bugfree3.0.3/assets/10643704/jui/css/base/images/ui-bg_highlight-soft_75_cccccc_1x100.png", "Referer=http://10.7.90.205/bugfree3.0.3/index.php/info/edit?type=case&action=opened&product_id=1", ENDITEM, 
		"Url=/bugfree3.0.3/assets/10643704/jui/css/base/images/ui-bg_flat_75_ffffff_40x100.png", "Referer=http://10.7.90.205/bugfree3.0.3/index.php/info/edit?type=case&action=opened&product_id=1", ENDITEM, 
		"Url=/bugfree3.0.3/assets/10643704/jui/css/base/images/ui-icons_222222_256x240.png", "Referer=http://10.7.90.205/bugfree3.0.3/index.php/info/edit?type=case&action=opened&product_id=1", ENDITEM, 
		"Url=/bugfree3.0.3/assets/e520453c/themes/default/default.css", "Referer=http://10.7.90.205/bugfree3.0.3/index.php/info/edit?type=case&action=opened&product_id=1", ENDITEM, 
		"Url=/bugfree3.0.3/assets/e520453c/themes/default/default.png", "Referer=http://10.7.90.205/bugfree3.0.3/index.php/info/edit?type=case&action=opened&product_id=1", ENDITEM, 
		LAST);

	lr_start_transaction("newcase");

	lr_think_time(28);

	web_url("edit_2", 
		"URL=http://10.7.90.205/bugfree3.0.3/index.php/info/edit?type=case&action=opened&product_id=1", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://10.7.90.205/bugfree3.0.3/index.php/case/list/1", 
		"Snapshot=t7.inf", 
		"Mode=HTML", 
		EXTRARES, 
		"Url=/bugfree3.0.3/assets/10643704/jui/css/base/images/ui-bg_flat_75_ffffff_40x100.png", "Referer=http://10.7.90.205/bugfree3.0.3/index.php/info/edit?type=case&action=opened&product_id=1", ENDITEM, 
		"Url=/bugfree3.0.3/assets/10643704/jui/css/base/images/ui-bg_highlight-soft_75_cccccc_1x100.png", "Referer=http://10.7.90.205/bugfree3.0.3/index.php/info/edit?type=case&action=opened&product_id=1", ENDITEM, 
		"Url=/bugfree3.0.3/assets/10643704/jui/css/base/images/ui-icons_222222_256x240.png", "Referer=http://10.7.90.205/bugfree3.0.3/index.php/info/edit?type=case&action=opened&product_id=1", ENDITEM, 
		"Url=/bugfree3.0.3/assets/e520453c/themes/default/default.css", "Referer=http://10.7.90.205/bugfree3.0.3/index.php/info/edit?type=case&action=opened&product_id=1", ENDITEM, 
		"Url=/bugfree3.0.3/assets/e520453c/themes/default/default.png", "Referer=http://10.7.90.205/bugfree3.0.3/index.php/info/edit?type=case&action=opened&product_id=1", ENDITEM, 
		"Url=/bugfree3.0.3/assets/ab61b02b/indicator.gif", "Referer=http://10.7.90.205/bugfree3.0.3/index.php/info/edit?type=case&action=opened&product_id=1", ENDITEM, 
		"Url=/bugfree3.0.3/assets/10643704/jui/css/base/images/ui-bg_glass_75_e6e6e6_1x400.png", "Referer=http://10.7.90.205/bugfree3.0.3/index.php/info/edit?type=case&action=opened&product_id=1", ENDITEM, 
		"Url=/bugfree3.0.3/assets/10643704/jui/css/base/images/ui-bg_glass_55_fbf9ee_1x400.png", "Referer=http://10.7.90.205/bugfree3.0.3/index.php/info/edit?type=case&action=opened&product_id=1", ENDITEM, 
		"Url=/bugfree3.0.3/assets/10643704/jui/css/base/images/ui-bg_glass_75_dadada_1x400.png", "Referer=http://10.7.90.205/bugfree3.0.3/index.php/info/edit?type=case&action=opened&product_id=1", ENDITEM, 
		LAST);

	lr_think_time(32);

	web_submit_data("edit_3", 
		"Action=http://10.7.90.205/bugfree3.0.3/index.php/info/edit?type=case&action=opened&product_id=1", 
		"Method=POST", 
		"EncType=multipart/form-data", 
		"RecContentType=text/html", 
		"Referer=http://10.7.90.205/bugfree3.0.3/index.php/info/edit?type=case&action=opened&product_id=1", 
		"Snapshot=t8.inf", 
		"Mode=HTML", 
		ITEMDATA, 
		"Name=CaseInfoView[deleted_file_id]", "Value=", ENDITEM, 
		"Name=CaseInfoView[lock_version]", "Value=", ENDITEM, 
		"Name=CaseInfoView[product_id]", "Value=1", ENDITEM, 
		"Name=isPageDirty", "Value=1", ENDITEM, 
		"Name=templateTitle", "Value=", ENDITEM, 
		"Name=CaseInfoView[title]", "Value={title}", ENDITEM, 
		"Name=layer1_module", "Value=0", ENDITEM, 
		"Name=CaseInfoView[productmodule_id]", "Value=0", ENDITEM, 
		"Name=CaseInfoView[case_status]", "Value=Active", ENDITEM, 
		"Name=CaseInfoView[assign_to_name]", "Value=系统管理员", ENDITEM, 
		"Name=CaseInfoView[mail_to]", "Value=", ENDITEM, 
		"Name=CaseInfoView[priority]", "Value=1", ENDITEM, 
		"Name=Custom[CaseType]", "Value={casetype}", ENDITEM, 
		"Name=Custom[CaseMethod]", "Value={method}", ENDITEM, 
		"Name=Custom[CasePlan]", "Value={plan}", ENDITEM, 
		"Name=Custom[ScriptStatus]", "Value=未计划", ENDITEM, 
		"Name=Custom[ScriptedBy]", "Value=系统管理员", ENDITEM, 
		"Name=Custom[ScriptedDate]", "Value=2019-05-27", ENDITEM, 
		"Name=Custom[ScriptLocation]", "Value=", ENDITEM, 
		"Name=Custom[CaseKeyword]", "Value=", ENDITEM, 
		"Name=Custom[DisplayOrder]", "Value=0", ENDITEM, 
		"Name=CaseInfoView[related_bug]", "Value=", ENDITEM, 
		"Name=CaseInfoView[related_case]", "Value=", ENDITEM, 
		"Name=attachment_file[]", "Value=", "File=Yes", ENDITEM, 
		"Name=CaseInfoView[action_note]", "Value=newcase", ENDITEM, 
		"Name=CaseInfoView[case_step]", "Value=[步骤]<br />\r\n1.newcase<br />\r\n2.newcase<br />\r\n<br />\r\n[验证]newcase<br />\r\n<br />\r\n[备注]newcase<br />\r\n<br />", ENDITEM, 
		LAST);

	web_image("BugFree", 
		"Alt=BugFree", 
		"Snapshot=t9.inf", 
		EXTRARES, 
		"Url=/bugfree3.0.3/themes/classic/assets/images/down.gif", ENDITEM, 
		"Url=/bugfree3.0.3/themes/classic/assets/images//close_div.gif", ENDITEM, 
		"Url=/bugfree3.0.3/assets/4b9d3645/img/page.gif", ENDITEM, 
		LAST);

	web_link("newcase", 
		"Text=newcase", 
		"Snapshot=t10.inf", 
		LAST);

	web_submit_data("getProductModule_3", 
		"Action=http://10.7.90.205/bugfree3.0.3/index.php/search/getProductModule", 
		"Method=POST", 
		"RecContentType=text/html", 
		"Referer=http://10.7.90.205/bugfree3.0.3/index.php/case/list/1", 
		"Snapshot=t11.inf", 
		"Mode=HTML", 
		ITEMDATA, 
		"Name=product_id", "Value=1", ENDITEM, 
		"Name=productmodule_id", "Value=0", ENDITEM, 
		LAST);

	web_url("getPreNextId", 
		"URL=http://10.7.90.205/bugfree3.0.3/index.php/search/getPreNextId?id=5&type=case&product_id=1", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://10.7.90.205/bugfree3.0.3/index.php/case/5", 
		"Snapshot=t12.inf", 
		"Mode=HTML", 
		LAST);

	lr_end_transaction("newcase",LR_AUTO);

	return 0;
}