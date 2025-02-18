document.addEventListener("DOMContentLoaded", function () {
    console.log("Apna Salon - JavaScript Loaded Successfully!");

    // Booking form validation
    const bookingForm = document.querySelector("form[action='/confirmBooking']");
    if (bookingForm) {
        bookingForm.addEventListener("submit", function (event) {
            const date = document.querySelector("input[name='date']").value;
            const time = document.querySelector("input[name='time']").value;

            if (!date || !time) {
                alert("Please select a valid date and time for your appointment.");
                event.preventDefault();
            }
        });
    }

    // Smooth scroll to sections
    document.querySelectorAll("nav a").forEach(anchor => {
        anchor.addEventListener("click", function (event) {
            event.preventDefault();
            const section = document.querySelector(this.getAttribute("href"));
            if (section) {
                section.scrollIntoView({ behavior: "smooth" });
            }
        });
    });
});
