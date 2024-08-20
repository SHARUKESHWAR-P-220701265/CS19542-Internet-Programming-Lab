
document.addEventListener('DOMContentLoaded', function() {
    const form = document.querySelector('form');
    const genderSelect = document.getElementById('gen');
    const genderIcon = document.getElementById('gen-icon');
    const confirmationMessage = document.getElementById('confirmationMessage');
    const resetButton = form.querySelector('input[type="reset"]');
    
    if (genderSelect && genderIcon) {
        genderSelect.addEventListener('change', function() {
            const selectedGender = this.value;
            
            if (selectedGender === 'Male') {
                genderIcon.classList.remove('bx-female-sign');
                genderIcon.classList.add('bx-male-sign');
            } else if (selectedGender === 'Female') {
                genderIcon.classList.remove('bx-male-sign');
                genderIcon.classList.add('bx-female-sign');
            }
        });
    }

    form.addEventListener('submit', function(event) {
        let isValid = true;
        let message = '';

        const sname = form.sname.value.trim();
        const roll = form.roll.value.trim();
        const gender = genderSelect.value;
        const year = form.year.value.trim();
        const dept = form.dept.value.trim();
        const sec = form.sec.value.trim();
        const email = form.email.value.trim();
        const addr = form.addr.value.trim();
        const country = form.country.value.trim();
        const city = form.city.value.trim();
        const pin = form.pin.value.trim();
        const declare = document.getElementById('declare').checked;

        if (!sname) {
            isValid = false;
            message += 'Student Name is required.\n';
        }

        if (!roll) {
            isValid = false;
            message += 'Roll Number is required.\n';
        }

        if (!gender) {
            isValid = false;
            message += 'Gender is required.\n';
        }

        if (!year) {
            isValid = false;
            message += 'Year is required.\n';
        }

        if (!dept) {
            isValid = false;
            message += 'Department is required.\n';
        }

        if (!sec) {
            isValid = false;
            message += 'Section is required.\n';
        }

        if (!email) {
            isValid = false;
            message += 'Email is required.\n';
        } else if (!validateEmail(email)) {
            isValid = false;
            message += 'Invalid Email format.\n';
        }

        if (!addr) {
            isValid = false;
            message += 'Address is required.\n';
        }

        if (!country) {
            isValid = false;
            message += 'Country is required.\n';
        }

        if (!city) {
            isValid = false;
            message += 'City is required.\n';
        }

        if (!pin) {
            isValid = false;
            message += 'Pincode is required.\n';
        }

        if (!declare) {
            isValid = false;
            message += 'Declaration is required.\n';
        }

        if (!isValid) {
            alert(message)
            event.preventDefault();
        }else {
            event.preventDefault(); // Prevent actual form submission for testing purposes
            confirmationMessage.style.display = 'block';
        }
    });
    resetButton.addEventListener('click', function() {
        confirmationMessage.style.display = 'none';
    });
    function validateEmail(email) {
        const re = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
        return re.test(String(email).toLowerCase());
    }
});

