function init(chk){
	if(chk){
		$('#logInPage').removeClass('hidePage').addClass('showPage');
		$('#logOutPage').removeClass('showPage').addClass('hidePage');
	}else{
		console.log('chk=>' + chk);
		$('#logInPage').removeClass('showPage').addClass('hidePage');
		$('#logOutPage').removeClass('hidePage').addClass('showPage');
	}
}