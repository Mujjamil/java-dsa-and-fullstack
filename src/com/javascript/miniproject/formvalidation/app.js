const form = document.getElementById("sigsignUpform");
const nameInput = document.getElementById("name");
const emailInput = document.getElementById("email")
const passwordInput = document.getElementById("password");
const confirmPassword = document.getElementById("confirm");
const nameError = document.getElementById("nameError");
const emailError = document.getElementById("emailError");
const passError = document.getElementById("passError");
const confirmError = document.getElementById("confrimpassError");
const result = document.getElementById("submit")

//function to show error
function showError(el,message){
    el.innerHTML = message;
}

//function to clear the error
function clearError(el){
    el.innerHTML = "";
}

//function to validate name
function validateName(){
    let value = nameInput.value.trim;
    if(value.length < 2){
        showError(nameError , "The Character must be more than 2")
        return false
    }
    clearError(nameError);
    return true;

}


//function to validate email
function validateEmail(){
    let value = emailInput.value.trim;
    if(!(/^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(value))){
        showError(emailError , "Enter the valid Input")
        return false;
    }
    clearError(emailError);
    return true;
}

//function to validate password
function validatePass(){
    let value = passwordInput.value;
    if(value.length < 8){
        showError(passError , "The Password should be atleast 8 character")
        return false;
    }
    clearError(passError)
    return true;
}

function validateConfirmPass(){
    let value = passwordInput.value;
    let confirm = confirmPassword.value;
    if(confirm == ""){
        showError(confirmError,"Please confirm your passowrd");
        return false;
    }
    if(confirm !== value ){
        showError(confirmError,"Password does not match")
        return false;
    }
    clearError(confirmError)
    return true;
}


//function to validateform
function validateForm(){
    let okName = validateName();
    let okEmail = validateEmail();
    let okPass = validatePass();
    let okConfirmPass = validateConfirmPass();
    return okName && okEmail && okPass && okConfirmPass;
}
