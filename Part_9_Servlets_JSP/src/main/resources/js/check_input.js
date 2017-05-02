function validate() {
	var result = true;
	if (document.getElementByName("name").value == null) {
		result = false;
	}
	if (!result) {
		alert("Please connect input date.");
	}
	return result;
}