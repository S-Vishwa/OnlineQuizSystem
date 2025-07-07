let questions = [
  { question: "What is 2 + 2?", options: ["3", "4", "5"], answer: 1 },
  { question: "Capital of France?", options: ["Paris", "London", "Rome"], answer: 0 }
];

function loadQuiz() {
  let container = document.getElementById("quiz-container");
  questions.forEach((q, i) => {
    let html = `<p>${q.question}</p>`;
    q.options.forEach((opt, j) => {
      html += `<input type='radio' name='q${i}' value='${j}'> ${opt}<br>`;
    });
    container.innerHTML += html;
  });
}

function submitQuiz() {
  const formData = new FormData();
  questions.forEach((_, i) => {
    const val = document.querySelector(`input[name="q${i}"]:checked`);
    formData.append(`q${i}`, val ? val.value : "");
  });
  fetch("QuizServlet", { method: "POST", body: formData })
    .then(res => res.text())
    .then(data => document.body.innerHTML = data);
}

window.onload = loadQuiz;