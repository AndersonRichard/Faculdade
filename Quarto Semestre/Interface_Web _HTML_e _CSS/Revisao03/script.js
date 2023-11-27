let currentIndex = 0;
const slides = document.querySelector('.slider').children;
const totalSlides = slides.length;

function nextSlide() {
  if (currentIndex < totalSlides - 1) {
    currentIndex++;
  } else {
    currentIndex = 0;
  }
  updateSlide();
}

function prevSlide() {
  if (currentIndex > 0) {
    currentIndex--;
  } else {
    currentIndex = totalSlides - 1;
  }
  updateSlide();
}

function updateSlide() {
  const slider = document.querySelector('.slider');
  const newPosition = -currentIndex * 100 + '%';
  slider.style.transform = 'translateX(' + newPosition + ')';
}


