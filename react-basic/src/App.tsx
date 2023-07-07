import './App.css';
import TestComponent  from './components/TestComponents';
import './style.css';
import Footer from './views/layout/Footer';
import Header from './views/layout/Header';
import Main from './views/layout/Main';


function App() {

  return (
   <>
    <TestComponent arg1='문자열' arg2={1}/>
    <TestComponent arg1='문자열2' arg2={100}/>
    <Header />
    <Main />
    <Footer />
   </>
   
  );
}

export default App;
