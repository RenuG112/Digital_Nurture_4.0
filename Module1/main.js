// 1. JavaScript Basics & Setup
console.log("Welcome to the Community Portal");
window.onload = () => {
  alert("Page fully loaded. Welcome!");
  init();
};

// Global event list
let events = [];

// 2. Syntax, Data Types, and Operators
const eventName = "Community Meetup";
const eventDate = "2025-06-30";
let seatsAvailable = 50;

console.log(`Event: ${eventName} on ${eventDate} with ${seatsAvailable} seats.`);

// 3. Conditionals, Loops, Error Handling
function isEventValid(event) {
  const today = new Date();
  const eventD = new Date(event.date);
  if (eventD < today) return false;
  if (event.seats <= 0) return false;
  return true;
}

function displayEvents(eventsToDisplay) {
  const container = document.getElementById("eventsContainer");
  container.innerHTML = "";

  eventsToDisplay.forEach(event => {
    if (isEventValid(event)) {
      const card = document.createElement("div");
      card.innerHTML = `<h3>${event.name}</h3>
                        <p>Date: ${event.date}</p>
                        <p>Seats left: ${event.seats}</p>
                        <button onclick="registerUser(${event.id})">Register</button>`;
      container.appendChild(card);
    }
  });
}

function registerUser(eventId) {
  try {
    const event = events.find(e => e.id === eventId);
    if (!event) throw new Error("Event not found");
    if (event.seats <= 0) throw new Error("No seats available");

    event.seats--;
    alert(`Registered for ${event.name}. Seats left: ${event.seats}`);
    displayEvents(events);
  } catch (error) {
    alert("Error: " + error.message);
  }
}

// 4. Functions, Scope, Closures, Higher-Order Functions

function addEvent(name, date, category, seats) {
  // Use closure to track registrations by category
  let totalRegistrations = 0;
  function register() {
    totalRegistrations++;
    return totalRegistrations;
  }
  return {
    id: Date.now() + Math.random(), // unique ID
    name,
    date,
    category,
    seats,
    registerUser: () => {
      if (seats <= 0) return false;
      seats--;
      register();
      return true;
    },
    getTotalRegistrations: () => totalRegistrations,
  };
}

function filterEventsByCategory(category, callback) {
  const filtered = category ? events.filter(e => e.category === category) : [...events];
  callback(filtered);
}

// 5. Objects and Prototypes

class Event {
  constructor(id, name, date, category, seats) {
    this.id = id;
    this.name = name;
    this.date = date;
    this.category = category;
    this.seats = seats;
  }
}

Event.prototype.checkAvailability = function() {
  return this.seats > 0;
};

// 6. Arrays and Methods

function addNewEvent(name, date, category, seats) {
  const newEvent = new Event(Date.now() + Math.random(), name, date, category, seats);
  events.push(newEvent);
}

function filterMusicEvents() {
  return events.filter(e => e.category === "Music");
}

function mapEventCards() {
  return events.map(e => `Workshop on ${e.name}`);
}

// 7. DOM Manipulation

function renderEvents(eventsList) {
  const container = document.querySelector("#eventsContainer");
  container.innerHTML = "";
  eventsList.forEach(event => {
    const card = document.createElement("div");
    card.classList.add("event-card");
    card.innerHTML = `
      <h3>${event.name}</h3>
      <p>Date: ${event.date}</p>
      <p>Category: ${event.category}</p>
      <p>Seats: ${event.seats}</p>
      <button onclick="handleRegister(${event.id})">Register</button>
    `;
    container.appendChild(card);
  });
}

// 8. Event Handling

document.getElementById("categoryFilter").onchange = function () {
  const selected = this.value;
  filterEventsByCategory(selected, renderEvents);
};

document.getElementById("searchBox").addEventListener("keydown", (e) => {
  if (e.key === "Enter") {
    e.preventDefault();
    const term = e.target.value.toLowerCase();
    const filtered = events.filter(ev => ev.name.toLowerCase().includes(term));
    renderEvents(filtered);
  }
});

function handleRegister(eventId) {
  const event = events.find(e => e.id === eventId);
  if (event && event.seats > 0) {
    event.seats--;
    alert(`Registered for ${event.name}`);
    renderEvents(events);
    updateFormEventOptions();
  } else {
    alert("No seats left!");
  }
}

// 9. Async JS, Promises, Async/Await

async function fetchEvents() {
  document.getElementById("loading").style.display = "block";
  try {
    // Mock endpoint with delay simulation
    const response = await new Promise((resolve) =>
      setTimeout(() => resolve({
        json: () => Promise.resolve([
          { id: 1, name: "Music Fest", date: "2025-07-10", category: "Music", seats: 100 },
          { id: 2, name: "Tech Talk", date: "2025-08-05", category: "Tech", seats: 50 },
          { id: 3, name: "Marathon", date: "2024-12-12", category: "Sports", seats: 0 },
        ]),
      }), 1000)
    );

    const data = await response.json();
    events = data.map(e => new Event(e.id, e.name, e.date, e.category, e.seats));
    renderEvents(events);
    updateFormEventOptions();
  } catch (error) {
    alert("Failed to load events: " + error);
  } finally {
    document.getElementById("loading").style.display = "none";
  }
}

// 10. Modern JavaScript Features

function updateFormEventOptions() {
  const select = document.querySelector('form select[name="event"]');
  select.innerHTML = '<option value="">Select Event</option>';
  events.forEach(({ id, name, seats, date }) => {
    // destructuring and template literals
    if (new Date(date) >= new Date() && seats > 0) {
      const option = document.createElement("option");
      option.value = id;
      option.textContent = `${name} (${seats} seats left)`;
      select.appendChild(option);
    }
  });
}

// 11. Working with Forms

document.getElementById("registrationForm").onsubmit = function (e) {
  e.preventDefault();

  const form = e.target;
  const name = form.elements["name"].value.trim();
  const email = form.elements["email"].value.trim();
  const eventId = form.elements["event"].value;

  const messageP = document.getElementById("formMessage");

  if (!name || !email || !eventId) {
    messageP.textContent = "All fields are required.";
    messageP.style.color = "red";
    return;
  }

  const selectedEvent = events.find(ev => ev.id == eventId);
  if (!selectedEvent || selectedEvent.seats <= 0) {
    messageP.textContent = "Selected event is full or invalid.";
    messageP.style.color = "red";
    return;
  }

  // 12. AJAX & Fetch API - Simulated

  messageP.style.color = "black";
  messageP.textContent = "Submitting registration...";

  setTimeout(() => {
    // Simulate success response
    selectedEvent.seats--;
    messageP.style.color = "green";
    messageP.textContent = `Registered successfully for ${selectedEvent.name}!`;
    renderEvents(events);
    updateFormEventOptions();
    form.reset();
  }, 1500);
};

// 13. Debugging and Testing
// Use Chrome DevTools to inspect console logs, network requests, set breakpoints on the above functions for debugging.

// 14. jQuery and JS
