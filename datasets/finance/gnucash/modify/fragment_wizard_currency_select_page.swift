import SwiftUI
struct fragment_wizard_currency_select_page: View {
    
    var body: some View {
        VStack
        {
            Text("Select Currency")
            List
            {
                ForEach(1..<10)
                {
                    index in
                    Text("Item \(index)")
                }
            }
            .listStyle(PlainListStyle())
            .padding(10)
        }}}

struct fragment_wizard_currency_select_page_Previews: PreviewProvider {
    static var previews: some View {
        fragment_wizard_currency_select_page()
    }
}
