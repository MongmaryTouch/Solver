function performJava() {
	$.get( "api", function( data ) { //api is the page extension
		var array = jQuery.parseJSON( data );;
		
		console.log(array.list);
		
		for (var obj in array.list.length) {
			console.log(array.list[obj]);
		}
  		$( "#result" ).html( data );	//#result is the id of the div
	});
}

// get data from java class into html